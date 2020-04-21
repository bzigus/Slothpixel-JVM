package zone.nora.slothpixel.util.exceptions.impl

import zone.nora.slothpixel.util.exceptions.SlothpixelApiException

/**
 * Thrown when there is an internal error getting leaderboard data... which happens to be most of the time.
 */
class QueryFailedException : SlothpixelApiException("Query failed")