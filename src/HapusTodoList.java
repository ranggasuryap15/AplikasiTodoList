public class HapusTodoList extends App{
//    private int number;
//    private String input;
//    private String[] model;
//
//    HapusTodoList(int number, String input){
//        this.number = number;
//        this.input = input;
//    }

    public boolean removeTodoList(int number) { // Integer itu tipedata bukan primitif (objek)
        if ((number - 1) >= model.length) {
            return false; // tidak valid atau dianggap gagal
        } else if (model[number - 1] == null) {
            return false; // tidak valid atau dianggap gagal, karena datanya udah null
        } else {
            model[number - 1] = null;

            // untuk menggeser angka yang dihapus
            for (int i = (number - 1); i < model.length; i++) {
                if (i == model.length - 1){ // kalo i nya sudah berada di ujung
                    model[i] = null; // maka model index ke i itu di set menjadi null
                } else {
                    model[i] = model[i + 1]; // kalo bukan data yang diujung, maka kita akan menggeser keatas
                }
            }
            return true;
        }
    }

    public void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODOLIST");

        var number  = input("Nomor yang di hapus (x jika batal)");

        if (number.equals("x")){
            // batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number)); // untuk mengkonversi dari String ke integer, karena variabel input nya itu bertipe String
            if (!success) {
                System.out.println("Gagal menghapus todolist: " + number);
            }
        }
    }
}
