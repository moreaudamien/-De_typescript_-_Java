// import { Address } from './address';
// import { Photo } from './photo';

// export class User {
//     birthdate: Date;
//     size: number;
//     photos: Photo[];
//     address: Address; 
// }

public class User {

    private String birthdate;
    private int size;
    private String photos;
    private String address;

    public User(String birthdate, int size, String photos, String address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;

    }

    public static void main(String[] args) {
        User user = new User("12/12/2012", 1, "photo", "address");
        System.out.println(user.birthdate);
        System.out.println(user.size);
        System.out.println(user.photos);
        System.out.println(user.address);
    }

}
