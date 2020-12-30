package com.yong.mall.tiny.service;

import com.yong.mall.tiny.dto.OssCallbackResult;
import com.yong.mall.tiny.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);

}
