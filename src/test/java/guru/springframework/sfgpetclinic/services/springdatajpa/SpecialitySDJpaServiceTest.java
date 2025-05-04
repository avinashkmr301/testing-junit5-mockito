package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    @Mock
    SpecialtyRepository specialtyRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @InjectMocks
    SpecialitySDJpaService service;

    @Test
    void delete() {
        service.delete(new Speciality());
    }

    @Test
    void deleteById(){
        service.deleteById(1L);
        service.deleteById(1L);
        verify(specialtyRepository,times(2)).deleteById(1L);
    }

    @Test
    void deleteByAtList(){
        service.deleteById(1L);
        service.deleteById(1L);
        verify(specialtyRepository,atLeastOnce()).deleteById(1L);
    }
    @Test
    void deleteByAtMost(){
        service.deleteById(1L);
        service.deleteById(1L);
        verify(specialtyRepository,atMost(5)).deleteById(1L);
    }
}