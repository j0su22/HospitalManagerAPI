package csf6.grupo2.HospitalManagerAPI.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_AILMENT", catalog = "ProyectoFinal")
public class Ailment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AILMENT")
    private int idAilment;

    @Column(name = "SMOKE")
    private int smoke;

    @Column(name = "DRINK")
    private int drink;

    @Column(name = "OBESE")
    private int obese;

    @Column(name = "MALNOURISHED")
    private int malnourished;

    @Column(name = "DIABETIC")
    private int diabetic;

    @OneToOne
    @JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER")
    private User idUser;
}
