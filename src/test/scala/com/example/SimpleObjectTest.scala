package com.example

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers;

class SimpleObjectTest extends AnyFlatSpec with Matchers {

  private lazy val mapper: ObjectMapper = {
    val objectMapper = new ObjectMapper
    objectMapper.registerModule(new JavaTimeModule)
    objectMapper.registerModule(new DefaultScalaModule)
    objectMapper
  }

  "This" should "work" in {
    val _ = mapper.writeValueAsString(SimpleObjectScala("test"))
    true shouldBe true
  }

  "This" should "work but is broken" in {
    val _ = mapper.writeValueAsString(new SimpleObjectJava("test"))
    true shouldBe true
  }
}


