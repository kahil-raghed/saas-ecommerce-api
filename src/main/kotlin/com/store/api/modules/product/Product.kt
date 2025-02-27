package com.store.api.modules.product

import org.bson.types.Decimal128
import org.springframework.data.annotation.Id

class Product {
    @Id()
    var id: String? = null
    var name: String = ""
    var description: String = ""
    var price: Decimal128 = Decimal128(123)

}