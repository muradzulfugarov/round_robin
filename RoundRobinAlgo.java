public class RoundRobinAlgo {
    final static int QUANTUM = 10;
    public static void main(String[] args) {
        int[] processes = new int[] {100, 20, 50};
        System.out.println(roundRobin(processes));
    }
    
    static int roundRobin(int[] processes) {
        int clock = 0;
        int totalTurnAround = 0;
        int len = processes.length;
        while(len > 0) {
            for(int i = 0; i < processes.length; i++ ) {
                if(processes[i] > 0) {
                    int min = Math.min(QUANTUM, processes[i]);
                    processes[i] -= min;
                    clock += min;
                    if(processes[i] == 0) {
                        totalTurnAround += clock;
                        len --;                        
                    } 
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        
        return totalTurnAround;
    }   
}
