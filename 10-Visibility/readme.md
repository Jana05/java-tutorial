# Java Visibility Operators
Following are the 4 types of access modifiers
- `public`
- `protected`
- `default`
- `private`

## Access Rules
- `public` - accessibile everywhere 
- `protected` - accessible anywhere in the same package or sub class of other package
- `default` - only accessible  in the same package
- `private` - only accessible with in the same class

## Access Table

| Access Location \ Access Modifier | public | protected | default | private | 
|-----------------------------------|--------|-----------|---------|---------| 
| Same Class                        | Yes    | Yes       | Yes     | Yes     | 
| Sub Class in Same Package         | Yes    | Yes       | Yes     | No      | 
| Other Class in Same Package       | Yes    | Yes       | Yes     | No      | 
| Sub Class in Other Package        | Yes    | Yes       | No      | No      | 
| Other Class in Other Package      | Yes    | No        | No      | No      | 
