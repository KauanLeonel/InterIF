import java.time.LocalDate;

import com.br.com.dio.dto.UserDTO;

public class Main {
    public static void main(String[] args){
        UserDTO dto  = new UserDTO();
        dto.setId(2);
        dto.setName("Maria");
        dto.setBirthday(LocalDate.now().minusYears(30));
    }
}
