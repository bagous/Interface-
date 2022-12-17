public abstract class DVD implements JenisDVD{
    public int Biaya(int harga, int lama_sewa) {
        return 0;
    }
    @Override
    public void Jenis_DVD(){
        System.out.println(" 1. DVD-R");
        System.out.println(" 2. DVD-RW");
        System.out.println(" 3. DVD+R");
    }
    abstract double getMoney();
}