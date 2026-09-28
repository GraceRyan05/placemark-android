package org.setu.placemark.main

class PlacedMarkList {

    private val placedMarks = mutableListOf<PlacedMark>()

    private var nextId = 1L

    fun create(placedMark: PlacedMark) {

        val markWithId = placedMark.copy(
            id = nextId++
        )

        placedMarks.add(markWithId)
    }

    fun findAll(): List<PlacedMark> {
        return placedMarks.toList()
    }

    fun findOne(id: Long): PlacedMark? {
        return placedMarks.find { it.id == id }
    }

    fun update(updatedMark: PlacedMark) {

        val index = placedMarks.indexOfFirst {
            it.id == updatedMark.id
        }

        if (index != -1) {
            placedMarks[index] = updatedMark
        }
    }

    fun delete(id: Long) {

        placedMarks.removeIf {
            it.id == id
        }
    }

    fun size(): Int {
        return placedMarks.size
    }
}