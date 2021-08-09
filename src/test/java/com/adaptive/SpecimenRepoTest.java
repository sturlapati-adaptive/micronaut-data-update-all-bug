package com.adaptive;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

@MicronautTest
class SpecimenRepoTest {
    @Inject
    SpecimenRepo specimenRepo;
    @Test
    void should_bulk_update() {
        List<Specimen> specimens = IntStream.range(0, 2)
                .mapToObj(i->{
                    Specimen s = new Specimen();
                    s.setId(UUID.randomUUID());
                    s.setName("SP-"+(i+1));
                    return s;
                })
                .toList();
        specimenRepo.saveAll(specimens);
        specimens.forEach(s->s.setName("%s-updated".formatted(s.getName())));
        //this call fails
        specimenRepo.updateAll(specimens);
        //updating individual entities works
//        specimenRepo.update(specimens.get(0));
//        specimenRepo.update(specimens.get(1));

    }
}
