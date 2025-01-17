/*
 *
 * Copyright 2021 Wei-Ming Wu
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package com.ckmates.java.practice.example2.controller.form;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class MemoForm {

  // TODO 只能用於String，若注入標的為空字串則做跳出提醒視窗，並且不會讓你創建
  @NotBlank(message = "Title can NOT be empty")
  String title;

  String text;

  String labels;

  boolean archived;

}
