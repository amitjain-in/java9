package amit.sandbox.java9.processapi;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessApiExamples {
    public static void main(String[] args) {
        System.out.println("Current pid is [" + ProcessHandle.current() + "]");
        System.out.println("All java pids: " + searchJavaProcess());
    }

    public static List<ProcessHandle.Info> searchJavaProcess() {
        return ProcessHandle.allProcesses()
                .filter(processHandle -> processHandle.info().command().isPresent() && processHandle.info().command().get().contains("java"))
                .map(ProcessHandle::info)
                .collect(Collectors.toList());
    }
}
