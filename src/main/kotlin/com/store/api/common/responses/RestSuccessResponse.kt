package com.store.api.common.responses

import com.store.api.common.enums.ResponseStatus

class RestSuccessResponse<TData>(override val data: TData?) : AbstractRestResponse<TData>() {
    override var status = ResponseStatus.success.name
}