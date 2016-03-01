package com.kakao.prmc.java8.service;

import com.kakao.prmc.java8.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
public class TestStramService {
    @Resource
    private StreamService streamService;

    @Test
    public void intStream() {
        this.streamService.intStream();
    }

    @Test
    public void of() {
        System.out.println(this.streamService.of());
    }

    @Test
    public void streamConcat() {
        System.out.println(this.streamService.concat());
    }

    @Test
    public void collectorJoining() {
        Assert.assertEquals(this.streamService.joining(), "0_1_2_3_4_5_6_7_8_9");
    }

    @Test
    public void anyMatch() {
        Assert.assertFalse(this.streamService.anyMatch("TEST"));
        Assert.assertTrue(this.streamService.anyMatch("VIEW"));
    }

    @Test
    public void reduce() {
        Assert.assertEquals(this.streamService.redcue(1, 10), 55);
    }

    @Test
    public void toArray() {
        Assert.assertArrayEquals(this.streamService.toArray(), new int[] {0, 1, 2});
    }

    @Test
    public void sorted() {
        Assert.assertArrayEquals(this.streamService.sorted(), new int[] {0, 1, 2, 3});
    }
}
