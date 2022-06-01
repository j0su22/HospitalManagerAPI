package csf6.grupo2.HospitalManagerAPI.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_DISEASE", catalog = "ProyectoFinal")
public class Disease implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISEASE")
    private int idDisease;

    @Column(name = "NAME")
    private String name;

    @Column(name = "INHERITANCE")
    private int inheritance;
}
