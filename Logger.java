package Atividade1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<String> logs;

    public Logger() {
        logs = new ArrayList<>();
    }

    
    public void addLog(String mensagem) {
        
        LocalDateTime agora = LocalDateTime.now();
        
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatter);
        
        
        String log = "[" + dataHoraFormatada + "] " + mensagem;
        
       
        logs.add(log);
    }

    
    public void showLogs() {
        if (logs.isEmpty()) {
            System.out.println("Não há logs para exibir.");
        } else {
            System.out.println("Logs:");
            for (String log : logs) {
                System.out.println(log);
            }
        }
    }
}

