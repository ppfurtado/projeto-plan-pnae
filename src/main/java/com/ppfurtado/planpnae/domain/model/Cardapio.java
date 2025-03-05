package com.ppfurtado.planpnae.domain.model;

import com.ppfurtado.planpnae.domain.mappers.JpaConverterJson;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "menu", schema = "planpnae")
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Convert(converter = JpaConverterJson.class)
    @Column(name = "mealSchedule", columnDefinition = "jsonb")
    private Map<String, String> refeicaooHorario = new HashMap<>();

    @Column(name = "dayWeek")
    private String diaSemana;

    @ManyToMany
    @JoinTable(
            name = "menu_foods",
            joinColumns = @JoinColumn(name = "menuId"),
            inverseJoinColumns = @JoinColumn(name = "foodId")
    )
    @Column(name = "foodId")
    private List<Ingredientes> ingredientes;
    @Column(name = "amount")
    private double quantidade;

    @Column(name = "created")
    private Date criada;
    @Column(name = "last_updated")
    private Date ultimaAtualizacao;

}