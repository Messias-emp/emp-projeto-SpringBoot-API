package emp_mais.emp_spring_boot_api.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
public class Feature extends BaseItem {
    // apenas herda BaseItem
}
