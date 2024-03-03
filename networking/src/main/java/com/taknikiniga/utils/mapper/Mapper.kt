package com.taknikiniga.utils.mapper

interface Mapper<F,T> {
     fun fromMap(from:F):T
}