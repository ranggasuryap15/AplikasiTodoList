public class TampilTodoList extends App{
//    private String todo;
//    private String input;
//
//    TampilTodoList(String todo, String input){
//        this.todo = todo;
//        this.input = input;
//    }

    public void showTodoList() {
        System.out.println("TODOLIST");
        for(var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1; // kita membuat + 1 karena array itu dimulai dari 0

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public void viewShowTodoList() {
        // dimasukkan di looping agar terus berjalan dan tidak berhenti (kode dibawah akan ada break untuk menghentikan looping)
        while (true) {
            showTodoList(); // untuk menampilkan yang diatas terlebih dahulu

            System.out.println("MENU: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            // untuk terima input dari user
            var input = input("PIlih");

            // pengecekan angka mana yang dipilih, 1, 2, atau 3
            if (input.equals("1")) {
                TambahTodoList tambahTodoList = new TambahTodoList();
                tambahTodoList.viewAddTodoList();
//                TambahTodoList.viewAddTodoList(); // kalo pilih 1 maka akan masuk ke sini
            } else if (input.equals("2")) {
                HapusTodoList hapusTodoList = new HapusTodoList();
                hapusTodoList.viewRemoveTodoList();
//                HapusTodoList.viewRemoveTodoList(); // kalo pilih 2 maka akan masuk ke sini
            } else if (input.equalsIgnoreCase("x")) {
                break; // kalo pilih x, maka ini yang akan menghentikan perulangan
            } else {
                System.out.println("Pilihan tidak di mengerti"); // kalo angka yang di input tidak ada yang sesuai
            }
        }
    }
}
