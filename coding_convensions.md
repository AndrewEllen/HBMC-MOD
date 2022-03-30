# Conventions
- [Coding Guideline](#coding-guideline)
  - [Variable Names](#variable-names)
  - [Indentation](#indentation)
  - [File Names](#file-names)
  - [File Locations](#file-locations)
  - [Commenting Guidelines](#commenting-guidelines)
- [Git Guidelines](#git-guidelines)
  - [Branches](#branches)
  - [Pull Requests](#pull-requests)

## Coding Guideline

- ### Variable Names
  - Use camelCase naming convention when defining variables.
    - The Exception to this is when defining a Function, Class or Widget. Always use capitalized letters for each word in this case (eg. FindMax()).
  - Use an underscore at the beginning of a booleans name when defining the variable.
  - Avoid using an underscore when defining a variable anywhere else.
  - Use meaningful, self describing variable names in all cases.
    - Avoid using shortened words for variable names as it makes the code harder to read and understand for other developers. (eg. routNmeCtrlr should be routineNameController).

- ### Indentation
  - Use a tab size of two spaces when coding.
  - Using "Reformat Code With 'dart format'" in Android studio may change some spacing to 4 spaces or some Widgets may insist on 4 spaces, don't worry about these.

- ### File Names
  - When naming a file make sure to use meaningful names without shortened words.
  - Use underscores instead of spaces in the names.

- ### File Locations
  - Files should be in the appropriate folders.

- ### Commenting Guidelines
  - When Commenting something that needs done in future please use "//todo" before the commented task. This will highlight it in yellow in Android Studio.

## Git Guidelines

- ### Branches
  - When Creating a branch please name it after the ticket you are working on).
  - Remember to do a pull before starting any work and before pushing your work.
  - Avoid editing files that are not needed for the current ticket while on your Branch.

- ### Pull Requests
  - When reviewing a pull request make sure to read over the changed code and verify the variable names follow the guidelines and that the code works.