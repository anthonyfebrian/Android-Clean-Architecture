package com.example.androidcleanarchitecture.data.results

/**
 * A sealed class that represents the result of an operation.
 *
 * @param T The type of the successful result data.
 * @param E The type of the error.
 */
sealed class Results<out T : Any, out E : Any> {
    /**
     * Represents the loading state of an operation.
     */
    data object Loading : Results<Nothing, Nothing>()

    /**
     * Represents a successful result of an operation.
     *
     * @param data The successful result data.
     */
    data class Success<T : Any>(val data: T) : Results<T, Nothing>()

    /**
     * Represents a failed result of an operation.
     *
     * @param error The error that occurred.
     */
    data class Failure<E : Any>(val error: E) : Results<Nothing, E>()

    /**
     * Represents a failure due to an unknown error.
     *
     * @param throwable The throwable that caused the error.
     */
    data class UnknownError(val throwable: Throwable) :
        Results<Nothing, Nothing>()
}
