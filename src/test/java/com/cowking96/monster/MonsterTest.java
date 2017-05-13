package com.cowking96.monster;

import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;
import com.cowking96.Monster;

/**
 * Created by nate on 5/11/17.
 */
public class MonsterTest {
    @Test
    public void empty_construction(){
        Monster exampleMonster = new Monster();
        assertThat(exampleMonster.getName()).isNull();
        assertThat(exampleMonster.getCr()).isEqualTo(0);
        assertThat(exampleMonster.getXpValue()).isEqualTo(0);
        assertThat(exampleMonster.getPageNumber()).isEqualTo(0);
    }

}
