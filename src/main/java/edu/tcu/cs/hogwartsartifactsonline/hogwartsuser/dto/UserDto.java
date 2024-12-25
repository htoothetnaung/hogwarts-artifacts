package edu.tcu.cs.hogwartsartifactsonline.hogwartsuser.dto;

import jakarta.validation.constraints.NotEmpty;
import org.aspectj.weaver.ast.Not;

public record UserDto(Integer id,

                      @NotEmpty(message = "Username is required.")
                      String username,

                      boolean enabled,

                    @NotEmpty(message = "Roles are required.")
                    String roles //Space separated roles

                      ) {
}
