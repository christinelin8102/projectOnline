package com.christine.mapper;

import com.christine.model.Roster;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RosterMapper {
    Roster findById(Long id);
}
