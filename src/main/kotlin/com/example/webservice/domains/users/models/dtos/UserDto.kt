package com.example.webservice.domains.users.models.dtos

import com.example.webservice.domains.common.models.dtos.BaseDto
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

class UserDto : BaseDto() {
    @NotBlank
    lateinit var name: String

    @NotBlank
    @Size(min = 3)
    lateinit var username: String

    var phone: String? = null

    @Email
    var email: String? = null

    @NotBlank
    @Size(min = 6)
    lateinit var password: String

    @NotBlank
    lateinit var gender: String

    @NotBlank
    lateinit var role: String
}
