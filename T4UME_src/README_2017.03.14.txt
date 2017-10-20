The model contains the Papyrus Model for FPX case study last update 2017.03.14

These models are exported from RSA and imported in Papyrus 1.14, the same version used in the consortium.
These models are planned to be used for Rule-based evolution approach via OCL constraints (see comments on OCL below).

The import step requires manual interventions.
In particular:

- models/profiles imported be imported in a dependency-free manner, i.e., only dependencies with already imported and valid Papyrus models are allowed. 
Possible manual fixes can be performed by manually selecting the artifacts to which the current imported project depends.

- modeling of pre/post conditions as well as OCL constrants cannot be imported as is from uCertifyIt test ready models.
Probably, it is due to different implementation of the OCL standard by the two UML modeling tools.

- Due to the aforementioned issues on OCL constraints specification, existing constrainsts on uTest libraries cannot be validated 
and cause errors during the validation of uTest liberaries in Papyrus.

- uTest CoreProfile has both Measurement ProfileType and StereoType that causes a warning during validation. This concept has to be clarified.


