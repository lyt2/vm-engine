package com.vm.frontend.service.inf;

import com.vm.dao.po.custom.CustomVmTagsGroups;
import com.vm.dao.po.VmTags;
import com.vm.frontend.service.dto.VmTagsDto;
import com.vm.frontend.service.dto.VmTagsGroupsDto;

import java.util.List;

/**
 * Created by ZhangKe on 2017/12/11.
 */
public interface VmTagsService {
    List<VmTagsGroupsDto> getTagsGroupsWithTags() throws Exception;

    List<VmTagsDto> getTags() throws Exception;

}
