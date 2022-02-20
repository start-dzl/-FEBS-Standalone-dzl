package com.dengzl.controller;

import cc.mrbird.febs.common.core.entity.FebsResponse;
import cc.mrbird.febs.common.core.entity.QueryRequest;
import cc.mrbird.febs.common.core.entity.constant.StringConstant;
import cc.mrbird.febs.common.core.entity.system.Log;
import cc.mrbird.febs.common.core.utils.FebsUtil;
import com.dengzl.service.ILogService;
import com.wuwenze.poi.ExcelKit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.endpoint.web.annotation.ControllerEndpoint;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

/**
 * @author MrBird
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("log")
public class LogController {

    private final ILogService logService;

    @GetMapping
    public FebsResponse logList(Log log, QueryRequest request) {
        Map<String, Object> dataTable = FebsUtil.getDataTable(this.logService.findLogs(log, request));
        return new FebsResponse().data(dataTable);
    }

}
