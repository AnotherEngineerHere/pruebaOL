package com.ol.co.service;

import com.ol.co.dto.DispositivoDTO;
import com.ol.co.mapper.DispositivoMapper;
import com.ol.co.model.Dispositivo;
import com.ol.co.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class DispositivoService {
    
    @Autowired
    private DispositivoRepository dispositivoRepository;

    @Autowired
    private DispositivoMapper dispositivoMapper;

    public List<DispositivoDTO> entityListToDTOList(List<Dispositivo> dispositivos) {
        return dispositivos.stream()
                .map(dispositivoMapper::entityToDTO)
                .collect(Collectors.toList());
    }
    
    public List<DispositivoDTO> getAllDispositivos() {
        List<Dispositivo> dispositivos = dispositivoRepository.findAll();
        return entityListToDTOList(dispositivos);
    }

    public DispositivoDTO getDispositivoById(Long id) {
        Optional<Dispositivo> optionalDispositivo = dispositivoRepository.findById(id);
        return optionalDispositivo.map(dispositivoMapper::entityToDTO).orElse(null);
    }

    public DispositivoDTO createDispositivo(DispositivoDTO dispositivoDTO) {
        Dispositivo dispositivo = dispositivoMapper.DTOtoEntity(dispositivoDTO);
        Dispositivo savedDispositivo = dispositivoRepository.save(dispositivo);
        return dispositivoMapper.entityToDTO(savedDispositivo);
    }

    public DispositivoDTO updateDispositivo(Long id, DispositivoDTO dispositivoDTO) {
        Optional<Dispositivo> optionalDispositivo = dispositivoRepository.findById(id);
        if (optionalDispositivo.isPresent()) {
            Dispositivo dispositivo = optionalDispositivo.get();
          
          

            Dispositivo updatedDispositivo = dispositivoRepository.save(dispositivo);
            return dispositivoMapper.entityToDTO(updatedDispositivo);
        }
        return null;
    }

    public boolean deleteDispositivo(Long id) {
        if (dispositivoRepository.existsById(id)) {
            dispositivoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
