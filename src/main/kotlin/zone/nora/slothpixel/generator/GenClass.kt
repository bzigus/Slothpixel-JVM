package zone.nora.slothpixel.generator

import java.io.File
import kotlin.system.exitProcess

val snakeRegex = "_[a-zA-Z]".toRegex()

fun main(args: Array<String>) {
    if (args.isEmpty()) exit("Please specify a file.")

    val inputFile = File(args[0])

    if (!inputFile.exists()) exit("File ${inputFile.name} does not exist.")

    val outputFile = File("gen/output/${inputFile.nameWithoutExtension}.kt")
    outputFile.createNewFile()

    outputFile.writeText("package todo\n\nimport com.google.gson.annotations.SerializedName\n\nclass ${outputFile.nameWithoutExtension} {\n")

    for (line in inputFile.readLines()) {
        val value = line.split("\":")[0].split("\"")[1]
        val type = when {
            line.endsWith("\",") -> "\"\""
            line.endsWith("true,") -> "false"
            line.endsWith("0,") ->  "0"
            else -> ""
        }
        outputFile.appendText("    @SerializedName(\"$value\")\n")
        outputFile.appendText("    val ${value.snakeToLowerCamelCase()} = $type\n\n")
    }
    outputFile.appendText("}")
}

fun exit(msg: String) {
    println(msg)
    exitProcess(0)
}

fun String.snakeToLowerCamelCase(): String {
    return snakeRegex.replace(this) {
        it.value.replace("_","")
            .toUpperCase()
    }
}