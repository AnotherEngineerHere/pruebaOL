package com.ol.co.service;

import com.ol.co.dto.UsuarioDTO;
import com.ol.co.mapper.UsuarioMapper;
import com.ol.co.model.Usuario;
import com.ol.co.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;

    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarioMapper.entityListToDTOList(usuarios);
    }

    public UsuarioDTO getUsuarioById(Long id) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        return optionalUsuario.map(usuarioMapper::entityToDTO).orElse(null);
    }

    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.DTOtoEntity(usuarioDTO);
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return usuarioMapper.entityToDTO(savedUsuario);
    }

    public UsuarioDTO updateUsuario(Long id, UsuarioDTO usuarioDTO) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            // Actualizar campos del usuario con los valores del DTO
           // usuario.setNombre(usuarioDTO.getNombre());
            // Actualizar más campos aquí...

            Usuario updatedUsuario = usuarioRepository.save(usuario);
            return usuarioMapper.entityToDTO(updatedUsuario);
        }
        return null;
    }

    public boolean deleteUsuario(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
