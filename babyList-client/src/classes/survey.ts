import {EnumValue} from "@angular/compiler-cli/src/ngtsc/partial_evaluator";

export class Survey {

  userName: string
  userEmail: string
  sexe: Sexe
  dateOfBirth: Date | undefined
  weightOfBirth: number | undefined
  childFirstName: string | undefined


}

export enum Sexe {
  MASCULIN = 'Garçon',
  FEMININ = 'Fille'
}
