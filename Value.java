import javax.swing.JOptionPane;

/*
 *@author heru yulianto 
 */

public class Mencari_Nilai_Akhir{
    public static void main(String[] args) {
        System.out.println("Nilai 85 - 100 : Grade A");
        System.out.println("Nilai 80 - 84  : Grade B+");
        System.out.println("Nilai 75 - 79  : Grade B");
        System.out.println("Nilai 70 - 74  : Grade C+");
        System.out.println("Nilai 60 - 69  : Grade C");
        System.out.println("Nilai 55 - 59  : Grade D+");
        System.out.println("Nilai 50 - 54  : Grade D");
        System.out.println("Nilai  0 - 53  : Grade E");

        System.out.println("");

        hitungNilai();

    
        }
    
        public static void hitungNilai(){ 
            String Nama = JOptionPane.showInputDialog(null,"Input Nama Siswa");
           
            String inputNilaiTugas = JOptionPane.showInputDialog("Input Nilai Tugas");
            int NilaiTugas = Integer.parseInt(inputNilaiTugas);
            String inputNilaiUTS = JOptionPane.showInputDialog("Input Nilai UTS");
            int NilaiUTS = Integer.parseInt(inputNilaiUTS);
            String inputNilaiUAS = JOptionPane.showInputDialog("Input Nilai UAS");
            int NilaiUAS = Integer.parseInt(inputNilaiUAS);
            
            /*
            * RUMUS NILAI AKHIR
            * Nilai : (Tugas + UTS + UAS) / 3
            */

            double Nilai = (double)(NilaiTugas+NilaiUTS+NilaiUAS)/3;
            
            if(Nilai >= 85 && Nilai <=100){
                System.out.println("Nama  = "+Nama);
                System.out.println("Nilai = "+Nilai+" Grade A.");
            }else if(Nilai >= 80 && Nilai <85){
                System.out.println("Nama  = "+Nama);
                System.out.println("Nilai = "+Nilai+" Grade B+.");
            }else if(Nilai >= 75 && Nilai <80){
                System.out.println("Nama  = "+Nama);
                System.out.println("Nilai = "+Nilai+" Grade B.");
            }else if(Nilai >= 70 && Nilai <75){
                System.out.println("Nama  = "+Nama);
                System.out.println("Nilai = "+Nilai+" Grade C+.");    
            }else if(Nilai >= 60 && Nilai <70){
                System.out.println("Nama  = "+Nama);
                System.out.println("Nilai = "+Nilai+" Grade C.");    
            }else if(Nilai >= 55 && Nilai <60){
                System.out.println("Nama  = "+Nama);
                System.out.println("Nilai = "+Nilai+" Grade D+.");    
            }else if(Nilai >= 50 && Nilai <55){
                System.out.println("Nama  = "+Nama);
                System.out.println("Nilai = "+Nilai+" Grade D.");    
            }else{
                System.out.println("Nama  = "+Nama);
                System.out.println("Nilai = "+Nilai+" Grade E.");    
            }
  
        }
    }
   
