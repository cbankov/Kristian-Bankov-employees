package app;

import app.Core.Engine;
import app.io.ConsoleWriter;
import app.io.FileIO;
import app.io.FileIOImpl;
import app.io.Writer;
import app.repository.EmployeeRepository;
import app.repository.EmployeeRepositoryImpl;
import app.service.EmployeeService;
import app.service.impl.EmployeeServiceImpl;

public class Employees {
    public static void main(String[] args) {

        FileIO fileIO = new FileIOImpl();
        Writer writer = new ConsoleWriter();
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        EmployeeService emplService = new EmployeeServiceImpl(employeeRepository);

        Engine engine = new Engine(fileIO, writer, emplService);
        engine.run();
    }
}
