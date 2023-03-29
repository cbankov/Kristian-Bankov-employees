package app.service;

import app.domain.Record;
import app.domain.Team;

import java.util.List;

public interface EmployeeService {

    void addEmployeeRecords(List<Record> records);

    List<Team> findAllTeamsWithOverlap();
}
