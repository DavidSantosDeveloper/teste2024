package com.jogos.ecommerce.domain.dto.input;

import java.sql.Date;
import com.jogos.ecommerce.domain.model.Usuario;

public record INPUT_VendaDTO (
Date dt_venda,
double valor_total,
Usuario usuario

){}
