/*
This file is part of Textricator.
Copyright 2018 Measures for Justice Institute.

This program is free software: you can redistribute it and/or modify it under
the terms of the GNU Affero General Public License version 3 as published by the
Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
PARTICULAR PURPOSE.  See the GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License along
with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

package io.mfj.textricator.record

data class Value(
		val text:String,
		val link:String? = null
) {
	fun getValue( attribute:String? ): String? =
			when(attribute) {
				null -> text
				"link" -> link
				else -> throw IllegalArgumentException("Unhandled attribute \"${attribute}\"." )
			}
}
