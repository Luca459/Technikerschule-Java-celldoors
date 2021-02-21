public class zellentueren2 {
    
    public static void main(String[] args) {
 
        String haeftlinge = javax.swing.JOptionPane.showInputDialog("Geben Sie die Anzahl der Häftlinge ein:");
        int zellen = Integer.parseInt(haeftlinge);
   
        System.out.println("Zellen: "+zellen);
 
        int n[] = new int[ zellen + 1 ];
        int i, j;
        for (i = 0; i < zellen; i++)
            n[i] = -1;
        for (i = 0; i < zellen; i = i + 1)
            for (j = 0; j < zellen + 1; j = j + (i + 1))
                n[j] = n[j] * (-1);
        for (i = 0; i < zellen; i++) {
            if (i == 1)
                i++;
            if (n[i] == 1)
                System.out.println("Offene tueren Sind: " + i);
        }
    }
}
