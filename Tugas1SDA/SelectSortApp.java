import java.io.*;
public class SelectSortApp
{
    public static void main(String[] ar)
    {
        int maxSize = 100; //ukuran array
        String namaFile = "words.txt";

        Arrays<String> data = new Arrays<String>(maxSize);
        TimeInterval ti = new TimeInterval();
        
        bacaFile(data, namaFile);
        
        ti.startTiming();
        data.selectionSort();
        ti.endTiming();
        
        System.out.println("Data sesudah diurutkan:");
        data.display();
        System.out.println("\nWaktu yang diperlukan oleh sequential search: " +ti.getElapsedTime());
    }
    
    private static void bacaFile(Arrays<String> data, String namaFile){
        try{
            // membuka file
            FileInputStream fstream = new FileInputStream(namaFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int x = 0;
            
            //membaca file baris per baris
            while ((strLine = br.readLine()) != null)   {
                data.insert(strLine);
                x++;
            }
            
            br.close();
        }
        catch(Exception e){
            System.out.println("Gagal membuka file");
        }
    }
}
