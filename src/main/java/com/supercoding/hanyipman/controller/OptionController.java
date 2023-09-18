package com.supercoding.hanyipman.controller;

import com.supercoding.hanyipman.dto.option.request.RegisterOptionItemRequest;
import com.supercoding.hanyipman.dto.option.request.RegisterOptionRequest;
import com.supercoding.hanyipman.dto.vo.Response;
import com.supercoding.hanyipman.service.OptionService;
import com.supercoding.hanyipman.utils.ApiUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seller-shops/options")
@Slf4j
@Api(tags = "옵션 관련 API")
public class OptionController {

    private final OptionService optionService;

    @Operation(summary = "옵션 신규 등록", description = "옵션 정보를 입력하여 옵션 레코드를 생성합니다.")
    @PostMapping(value = "/menus/{menu_id}", headers = "X-API-VERSION=1")
    public Response<Void> registerOption(@PathVariable(value = "menu_id") Long menuId,
                                            @RequestBody RegisterOptionRequest registerOptionRequest) {
        optionService.registerOption(registerOptionRequest, menuId);
        return ApiUtils.success(HttpStatus.CREATED, "옵션 등록 성공", null);
    }

    @Operation(summary = "옵션 수정", description = "옵션 정보를 입력하여 옵션 레코드를 수정합니다.")
    @PutMapping(value = "/{option_id}", headers = "X-API-VERSION=1")
    public Response<Void> changeOptionName(@PathVariable(value = "option_id") Long optionId,
                                            @RequestBody RegisterOptionRequest registerOptionRequest) {
        optionService.changeOption(registerOptionRequest, optionId);
        return ApiUtils.success(HttpStatus.OK, "옵션 수정 성공", null);
    }

    @Operation(summary = "옵션 아이템 신규 등록", description = "옵션 정보를 입력하여 옵션 레코드를 생성합니다.")
    @PostMapping(value = "/{option_id}", headers = "X-API-VERSION=1")
    public Response<Void> registerOptionItem(@PathVariable(value = "option_id") Long optionId,
                                             @RequestBody RegisterOptionItemRequest registerOptionItemRequest) {
        optionService.registerOptionItem(registerOptionItemRequest, optionId);
        return ApiUtils.success(HttpStatus.CREATED, "옵션 아이템 등록 성공", null);
    }


}
