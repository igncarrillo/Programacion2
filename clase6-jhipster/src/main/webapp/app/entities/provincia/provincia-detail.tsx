import React, { useEffect } from 'react';
import { connect } from 'react-redux';
import { Link, RouteComponentProps } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import {} from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { IRootState } from 'app/shared/reducers';
import { getEntity } from './provincia.reducer';
import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';

export interface IProvinciaDetailProps extends StateProps, DispatchProps, RouteComponentProps<{ id: string }> {}

export const ProvinciaDetail = (props: IProvinciaDetailProps) => {
  useEffect(() => {
    props.getEntity(props.match.params.id);
  }, []);

  const { provinciaEntity } = props;
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="provinciaDetailsHeading">Provincia</h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">ID</span>
          </dt>
          <dd>{provinciaEntity.id}</dd>
          <dt>
            <span id="nombre">Nombre</span>
          </dt>
          <dd>{provinciaEntity.nombre}</dd>
          <dt>
            <span id="zipcode">Zipcode</span>
          </dt>
          <dd>{provinciaEntity.zipcode}</dd>
          <dt>Pais</dt>
          <dd>{provinciaEntity.pais ? provinciaEntity.pais.nombre : ''}</dd>
        </dl>
        <Button tag={Link} to="/provincia" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" /> <span className="d-none d-md-inline">Back</span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/provincia/${provinciaEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" /> <span className="d-none d-md-inline">Edit</span>
        </Button>
      </Col>
    </Row>
  );
};

const mapStateToProps = ({ provincia }: IRootState) => ({
  provinciaEntity: provincia.entity,
});

const mapDispatchToProps = { getEntity };

type StateProps = ReturnType<typeof mapStateToProps>;
type DispatchProps = typeof mapDispatchToProps;

export default connect(mapStateToProps, mapDispatchToProps)(ProvinciaDetail);
