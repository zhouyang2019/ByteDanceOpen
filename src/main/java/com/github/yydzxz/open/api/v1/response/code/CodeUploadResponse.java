package com.github.yydzxz.open.api.v1.response.code;

import com.github.yydzxz.common.error.ByteDanceError;
import com.github.yydzxz.common.http.IByteDanceResponse;
import lombok.Data;

/**
 * @author yangyidian
 * @date 2020/07/01
 **/
@Data
public class CodeUploadResponse extends ByteDanceError implements IByteDanceResponse {

    private static final long serialVersionUID = -790513383562193517L;
}
