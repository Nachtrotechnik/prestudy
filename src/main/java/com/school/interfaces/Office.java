package com.school.interfaces;

import com.school.enums.Department;
import com.school.enums.Event;
import com.school.enums.Public;

public interface Office {
    String manage(Department department, String action);
    String organize(Event event, String details);
    String pr(Public publicEntity, String contact);
}
