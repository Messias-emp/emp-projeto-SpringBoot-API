package emp_mais.emp_spring_boot_api.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_news") // opcional, só se quiser definir o nome da tabela
public class News extends BaseItem {
    // aqui você pode colocar atributos específicos de News se precisar
}
