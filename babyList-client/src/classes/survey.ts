import {EnumValue} from "@angular/compiler-cli/src/ngtsc/partial_evaluator";

export class Survey {

  userName: string | undefined
  userEmail: string | undefined
  sexe: Sexe | undefined
  dateOfBirth: Date | undefined
  weightOfBirth: number | undefined
  childFirstName: string | undefined


}

export enum Sexe {
  MASCULIN = 'Garçon',
  FEMININ = 'Fille',
  BOTH = 'Les deux'
}
