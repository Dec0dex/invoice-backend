package net.decodex.invoice.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Resource not found")
class ResourceNotFoundException : RuntimeException()