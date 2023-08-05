package com.orange.model.enumeration;

import com.orange.model.dto.BaseErrorCode;
import org.springframework.http.HttpStatus;


public enum ValidateErrorCode implements BaseErrorCode {
    //code 1 -failed
    START_DATE(1, "ngày hiệu lực phải lớn hơn hoặc bằng ngày hiện tại", HttpStatus.BAD_REQUEST),
    EFFECT_DATE(1, "ngày kết thúc hiệu lực phải lớn hơn hoặc bằng ngày bắt đầu hiệu lực", HttpStatus.BAD_REQUEST),
    NON_RIGHT(1, "không có quyền phê duyệt cấu hình.", HttpStatus.BAD_REQUEST),
    NO_DATA(1, "không có thông tin cấu hình.", HttpStatus.BAD_REQUEST),
    NO_DOCUMENT_DATA(1, "không có thông tin tài liệu.", HttpStatus.BAD_REQUEST),
    UNAVAILABLE_STATUS(1, "Trạng thái của cấu hình không hợp lệ", HttpStatus.BAD_REQUEST),
    INVALID_CONF_DATA(1, "Thông tin của cấu hình không hợp lệ", HttpStatus.BAD_REQUEST)
    ;

    private int code;

    private String message;

    private HttpStatus httpStatus;

    ValidateErrorCode(int code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.message = message;
    }
    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}