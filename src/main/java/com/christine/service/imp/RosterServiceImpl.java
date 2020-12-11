package com.christine.service.imp;

import com.christine.mapper.RosterMapper;
import com.christine.model.Roster;
import com.christine.service.RosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RosterServiceImpl implements RosterService {

    @Autowired
    RosterMapper rosterMapper;

    @Override
    public Roster findById(Long id) {
        return rosterMapper.findById(id);
    }
}
