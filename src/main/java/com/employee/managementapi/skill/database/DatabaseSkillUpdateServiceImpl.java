package com.employee.managementapi.skill.database;

import org.springframework.stereotype.Service;

import com.employee.managementapi.infrastructure.employee.DatabaseSkill;
import com.employee.managementapi.infrastructure.employee.DatabaseSkillMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DatabaseSkillUpdateServiceImpl implements DatabaseSkillUpdateService {

    private final DatabaseSkillMapper databaseSkillMapper;

    @Override
    public DatabaseSkillNameWithPrimaryKey insert(final DatabaseSkillName databaseSkillName) {
        DatabaseSkill databaseSkill = DatabaseSkill.build(databaseSkillName);
        int databaseSkillId = databaseSkillMapper.selectNextval();
        databaseSkill.setDatabaseSkillId(databaseSkillId);
        databaseSkillMapper.insert(databaseSkill);
        return databaseSkillName.toDatabaseSkillNameWithPrimaryKey(databaseSkillId);
    }

}
