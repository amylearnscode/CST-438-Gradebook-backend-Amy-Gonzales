package com.cst438.domain;

import com.cst438.domain.AssignmentDTO;


public class AssignmentDTO {
   public String assignmentName;
   public int courseId;
   public String dueDate;
   
   
public AssignmentDTO(String assignmentName) {
   this.assignmentName = assignmentName;
}
public AssignmentDTO(String assignmentName, String dueDate, int courseId) {
   this.assignmentName = assignmentName;
   this.dueDate = dueDate;
   this.courseId = courseId;
}
public AssignmentDTO() {}

 
@Override
public boolean equals(Object obj) {
   if (this == obj)
      return true;
   if (obj == null)
      return false;
   if (getClass() != obj.getClass())
      return false;
   AssignmentDTO other = (AssignmentDTO) obj;
   
   if (assignmentName == null) {
      if (other.assignmentName != null)
         return false;
   } else if (!assignmentName.equals(other.assignmentName))
      return false;
   if (courseId != other.courseId)
      return false;
   
   if (dueDate == null) {
      if (other.dueDate != null)
         return false;
   } else if (!dueDate.equals(other.dueDate))
      return false;
   return true;
}
@Override
public String toString() {
   return "AssignmentDTO [ assignmentName=" + assignmentName + ", dueDate="
         + dueDate + "courseId=" + courseId + "]";
}
}

